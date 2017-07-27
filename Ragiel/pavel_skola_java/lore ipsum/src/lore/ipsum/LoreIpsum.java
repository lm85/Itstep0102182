/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lore.ipsum;

/**
 *
 * @author Student
 */
public class LoreIpsum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin dignissim, felis a fringilla laoreet, elit ante aliquet nisi, tristique ultrices enim purus a massa. Duis tincidunt dolor non sapien aliquet vehicula. Donec volutpat, sapien sit amet congue aliquam, erat sapien sodales erat, ut porta tortor turpis nec risus. Nullam eget libero id neque pharetra condimentum eu at sapien. Pellentesque luctus enim nec facilisis cursus. Sed a turpis arcu. Integer luctus, turpis eu semper facilisis, nulla massa egestas magna, nec blandit neque arcu ut nisl. Curabitur a aliquam purus, eget maximus ipsum. Proin sed leo facilisis, gravida metus eu, elementum nisi. Aliquam erat volutpat. Donec ullamcorper sem a diam egestas porta. Aliquam a magna mollis massa ornare consectetur id eu nunc. Nulla maximus malesuada volutpat. Etiam vestibulum neque viverra faucibus elementum. Pellentesque facilisis, nunc id lobortis tincidunt, sem quam pellentesque lectus, ut pellentesque tellus nunc vitae velit.\n" +
"\n" +
"Etiam consequat justo turpis, in consectetur dolor dictum sed. Praesent auctor luctus mauris vel ornare. Praesent suscipit rhoncus turpis viverra semper. Praesent pharetra diam non diam pretium, vitae dignissim ligula dapibus. Donec tempus fermentum imperdiet. Cras nunc ligula, tristique a magna vitae, interdum vehicula neque. Aliquam viverra, lacus at bibendum faucibus, lorem lacus mollis tellus, vitae maximus justo elit vitae tortor. Mauris quis volutpat leo. Aenean in lobortis ex. Integer vestibulum mauris quis ultrices bibendum. Nulla neque dui, ultricies et finibus ut, tempor non purus. Suspendisse vestibulum, neque eget varius vestibulum, eros tellus eleifend metus, vitae efficitur ex neque ac purus. In porta neque sapien, ac malesuada erat mattis vitae. Nullam et lacus varius, tincidunt mauris congue, fermentum quam.\n" +
"\n" +
"Quisque vestibulum, magna et finibus placerat, sem nibh tempus purus, a tincidunt elit nibh in ex. Phasellus at mauris in risus efficitur lobortis eu nec nibh. Aenean facilisis lorem maximus felis gravida consequat. Curabitur molestie, lorem at volutpat congue, sem dolor pulvinar velit, nec congue eros nibh non justo. Vestibulum vitae eleifend nunc. Morbi ultricies id magna et porta. Duis pharetra augue quis lectus bibendum maximus. Ut nec euismod mi. Morbi ultricies justo ex, eget commodo velit commodo nec. Aenean sit amet tellus laoreet lorem pretium feugiat. Etiam malesuada in neque vitae ultrices. Donec ut sapien sagittis, condimentum sem at, tristique tortor. Mauris eget tellus at arcu venenatis gravida.\n" +
"\n" +
"Curabitur aliquam convallis magna, ac vulputate justo placerat at. Proin vehicula sem non dignissim tempus. Vestibulum fermentum lectus id ipsum suscipit scelerisque. Phasellus aliquam dui odio, sit amet vehicula ipsum finibus eu. Donec laoreet, ex sed bibendum viverra, magna metus vulputate purus, sed ultricies neque tortor vitae eros. Etiam id tellus sed massa pretium vestibulum ac quis velit. Nam lobortis sem eget ante porttitor euismod. Proin venenatis rhoncus massa. Morbi vestibulum maximus ex, ultrices dictum libero egestas at. Sed gravida quam elit, a eleifend elit suscipit ac. Mauris augue nulla, maximus et diam quis, ultricies luctus nibh.\n" +
"\n" +
"Nullam velit quam, molestie id sapien tempor, eleifend semper nisi. Mauris non aliquet ante, sit amet facilisis nunc. Quisque aliquam augue ac enim iaculis, vitae ultricies justo posuere. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla facilisi. Aenean a turpis a elit pulvinar dapibus non ac nisl. Suspendisse tincidunt gravida dui eu luctus. Suspendisse potenti. Nunc egestas maximus posuere. Donec ac mi non velit imperdiet lobortis id vel lorem. Vivamus condimentum nulla ac arcu congue, ut pellentesque nisi pretium. Nullam dapibus sapien ornare nibh consectetur, nec lacinia nulla varius. Donec sollicitudin hendrerit elit quis convallis.";
        
       
     int[]pocetZnaku=new int[26];
     boolean run=true;
    int j =0;
     loremIpsum=loremIpsum.toUpperCase();
     
     while(j<loremIpsum.length()){
    
         for (int i = 0; i < pocetZnaku.length; i++) {
           
             if (loremIpsum.charAt(j)== i+65){
                 pocetZnaku[i]=pocetZnaku[i]+1;}
             j++;
         }
            }
            for (int i = 0; i < pocetZnaku.length; i++) {
           
             System.out.println(pocetZnaku[i]);
             }
    }
     
    
     
}
