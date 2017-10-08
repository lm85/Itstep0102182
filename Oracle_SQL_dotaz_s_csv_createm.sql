SET serveroutput ON
SET TERM OFF
SET ECHO OFF
SET PAU OFF
SET FEEDBACK OFF
SET HEA OFF
SET LINESIZE 2000
SET TRIMS ON
SET PAGESIZE 0
SET VERIFY OFF
SET ARRAYSIZE 100
--v praci jsem si musel pripravit nejaka data a tak jsem pouzil stackoverflow 
--a sql dotaz si ladil se strukturou db mi museli pomoci - db ceske pojistovny je moc rozsahla
--nazvy tabulek jsou vetsinou hashovany
--vystupem je csv

--Reseni nepovinnych vstupnich parametru pro skript, toto je v podstate jediny zpusob jak to resit
set termout off;
col p1 new_value 1;
select null p1 from dual where  1=2;
select nvl('&1',3) p1 from dual;
set termout on;

spool GPK_ST_SMOKE_102-vyhledani_klienta-PU.csv

BEGIN
  dbms_output.put_line('username;rodne_cislo;pojistna_udalost;PrijmeniJmeno');

  FOR lr_partner IN (
      ---select start  
			SELECT *
        FROM (SELECT cla.claim_no
                    ,cla.system_id
                    ,cla.company_id
                    ,zneceho.zneceho_birth_no
                    ,zneceho.zneceho_firstname
                    ,zneceho.zneceho_surname
                    ,zneceho.zneceho_cli_master_ccd_id
                FROM ccd2.bdt_partners_unif zneceho
                    ,ccd2.bdt_partners_rels prr
                    ,ccd2.bdt_partners      partner
                    ,ccd2.bdt_claim_roles   pcp
                    ,ccd2.bdt_claim         cla
               WHERE -- Join podmínky
                     zneceho.zneceho_key = prr.prr_zneceho_key
                 AND prr.prr_partner_ccd_id = partner.partner_ccd_id
                 AND partner.partner_src_ext_id = pcp.ext_id
                 AND partner.partner_srs_key = pcp.system_id
                 AND pcp.claim_no = cla.claim_no
                 AND pcp.system_id = cla.system_id
                 -- Otevřené PU
                 AND cla.claim_status in (4,6,7)
                 -- FO
                 AND zneceho.zneceho_ptt_key = 1
                 -- FOP
                 -- AND zneceho.zneceho_ptt_key = 2
                 -- PO
                 -- AND zneceho.zneceho_ptt_key = 3
               ) 
			where rownum  <= &1
      ---select end  
     ) 
  LOOP
    dbms_output.put('jmenoSite\USeR'      || ';' ||
                   lr_partner.zneceho_birth_no    || ';' ||
                   lr_partner.claim_no        || ';' ||
                   lr_partner.zneceho_surname     || ' ' || lr_partner.zneceho_firstname 
                   );
			   
	dbms_output.new_line;		
  END LOOP;
  
END;
/

spool OFF;


EXIT
