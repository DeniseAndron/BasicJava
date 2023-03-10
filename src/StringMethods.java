public class StringMethods {
//  length()	returns the length
//concat()	concatenates two strings
//equals()	checks for equality between two strings
//indexOf()	returns the index of a substring
//charAt()	returns a character
//substring()	returns a substring
//toUpperCase()	returns the upper case version
//toLowerCase()	returns the lower case version


    public static void main(String[] args) {
        // program that determines whether there is a protein in a strand of DNA.
        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA" ;
        String dna3 = "ATTAATATGTACTGA";
        String dna = dna1;
        System.out.println(dna.length());
        System.out.println(dna.indexOf("ATG"));
        System.out.println(dna.indexOf("TGA"));

        if ((dna.indexOf("ATG") != -1) && (dna.indexOf("TGA") != -1)){
            int totalNumbers = dna.indexOf("TGA") -(dna.indexOf ("ATG") + 3);
            boolean isprotein = totalNumbers % 3 == 0;
            System.out.println(isprotein);



        } else {
            System.out.println("No protein");
        }

    }

}

