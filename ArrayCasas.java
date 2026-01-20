
public class ArrayCasas{
public static void main(String[]args){
    
 String[] casa1 =new String[5];
 String[] casa2 =new String[5];
 String[] casa3 =new String[5];
 String[] casa4 =new String[5];
 String[] casa5 =new String[5];
 
 
    casa1[0] = "Brasileira";
    casa1[1] = "Amarela";
    casa1[2] = "suco de maracuja";
    casa1[3] = "tucano";
    casa1[4] = "samba";
    
    casa2[0] = "Japonesa";
    casa2[1] = "azul";
    casa2[2] = "chá verde";
    casa2[3] = "Panda";
    casa2[4] = "k-pop";

    casa3[0] = "Italiana";
    casa3[1] = "Verde";
    casa3[2] = "Café";
    casa3[3] = "Lobo";
    casa3[4] = "Opera";

    casa4[0] = "Canadense";
    casa4[1] = "Vermelha";
    casa4[2] = "Xarope";
    casa4[3] = "Castor";
    casa4[4] = "Jazz";

    casa5[0] = "sul africana";
    casa5[1] = "Laranja";
    casa5[2] = "Refrigerante";
    casa5[3] = "Leão";
    casa5[4] = "Rock";

  String[][] casas = { casa1, casa2, casa3, casa4, casa5};
 
        for (int i = 0; i < casas.length; i++) {
            System.out.println("Casa " + (i + 1));
            System.out.println("Nacionalidade: " + casas[i][0]);
            System.out.println("Cor: " + casas[i][1]);
            System.out.println("Bebida: " + casas[i][2]);
            System.out.println("Animal: " + casas[i][3]);
            System.out.println("Estilo musical: " + casas[i][4]);
            
} 
}
}
