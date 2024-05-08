package com.haddad.readers;

import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        WordByWordDocumentReader wordByWordDocumentReader = new WordByWordDocumentReader();
        List<String> document =wordByWordDocumentReader.readDocument ("C:\\Users\\amari\\OneDrive\\Desktop\\MP\\petit_corpus");
        Analyzor analyseur = new Analyzor();
        Pretraiteur pretraiteur = new Pretraiteur();
        System.out.println("Donner votre path :");


        // Obtenir et afficher le contenu du document
        System.out.println("Contenu du document :");
        System.out.println(document);


        List<String> preprocessor1=pretraiteur.DeleteEmptyWords( document);
        System.out.println("Contenu du document pretraite :");
        System.out.println(preprocessor1);
        Map<String, Integer> dic=analyseur.analyse(preprocessor1);
        System.out.println("Contenu du document pretraite :");
        System.out.println(dic);
    }
}

        /*
        Analyzor analyzor=new Analyzor();
        System.out.println("Contenu du document analyse :");
        List<Statistic> test= analyzor.analyse(preprocessor,document);
        for(Statistic statistic :test){
            System.out.println(""+statistic.getWord()+":"+statistic.getStatistique());


        }



    }

}
*/