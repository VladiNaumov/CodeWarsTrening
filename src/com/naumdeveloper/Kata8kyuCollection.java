package com.naumdeveloper.codewars;

import java.util.HashMap;
import java.util.Optional;

public class Kata8kyuCollection {

    public static void main(String[] args) {

    }

    /*
    Your start-up's BA has told marketing that your website has a large audience in Scandinavia and surrounding countries. Marketing thinks it would be great to welcome visitors to the site in their own language. Luckily you already use an API that detects the user's location, so this is an easy win.

        The Task
        Think of a way to store the languages as a database (eg an object). The languages are listed below so you can copy and paste!
        Write a 'welcome' function that takes a parameter 'language' (always a string), and returns a greeting - if you have it in your database. It should default to English if the language is not in the database, or in the event of an invalid input.
        The Database
        english: "Welcome",
        czech: "Vitejte",
        danish: "Velkomst",
        dutch: "Welkom",
        estonian: "Tere tulemast",
        finnish: "Tervetuloa",
        flemish: "Welgekomen",
        french: "Bienvenue",
        german: "Willkommen",
        irish: "Failte",
        italian: "Benvenuto",
        latvian: "Gaidits",
        lithuanian: "Laukiamas",
        polish: "Witamy",
        spanish: "Bienvenido",
        swedish: "Valkommen",
        welsh: "Croeso"
     */

    public static String greet(String language){
        HashMap<String, String> languages = new HashMap<String, String>();

        languages.put("english", "Welcome");
        languages.put("czech", "Vitejte");
        languages.put("danish", "Velkomst");
        languages.put("dutch", "Welkom");
        languages.put("estonian", "Tere tulemast");
        languages.put("finnish", "Tervetuloa");
        languages.put("flemish", "Welgekomen");
        languages.put("french", "Bienvenue");
        languages.put("german", "Willkommen");
        languages.put("irish", "Failte");
        languages.put("italian", "Benvenuto");
        languages.put("latvian", "Gaidits");
        languages.put("lithuanian", "Laukiamas");
        languages.put("polish", "Witamy");
        languages.put("spanish", "Bienvenido");
        languages.put("swedish", "Valkommen");
        languages.put("welsh", "Croeso");

        return Optional.ofNullable(languages.get(language)).orElse("Welcome");
    }

}
