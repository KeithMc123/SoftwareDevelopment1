public class Types{
    public static void main(String[] args) {

        /*“Jim is a 40 year old man. Life is tough on Jim. He works as a plumber.
        He is divorced and has 8 children.Heearns 700 a week but needs 800 a week to support his ex wife and children.
        He was hoping to pass an exam which would enable him to earn more, but unfortunately poor Jim failed it with a score of 27.5”*/

        String name = "Jim";
        String gender = "man";
        String lifequality = "tough";
        String occupation = "plumber";
        String maritalstatus = "divorced";
        String partnergender = "wife";
        int $ = 700;
        int more$ = 800;
        int numchildren = 8;
        int age = 40;
        double examscore = 27.5;

        System.out.println(name+ " is a " +age+ " year old " +gender+ ". life is " +lifequality+ " on " +name+ ". He works as a " +occupation+ ".\nHe is " +maritalstatus+ " and has " +numchildren+ " children. He earns " +$+ " a week but needs " +more$+ " a week to support his ex " +partnergender+ " and children.\nHe was hoping to pass an exam which would enable him to earn more, but unfortunately poor " +name+ " failed it with a score of " +examscore+ "." );

    }
}
