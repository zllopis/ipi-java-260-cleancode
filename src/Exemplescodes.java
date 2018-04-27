public class Exemplescodes {


//Règle 1 : Choisir des noms pronomçables
    public void wxswwxkl(Object obj){
        Node newNode = new Node(obj, null);
        if( size == 0 )
            head = newNode;
        else
            tail.setNext(newNode);
        tail = newNode;
        size++;
    }
//Correction
    public void add(Object obj){
        Node newNode = new Node(obj, null);
        if( size == 0 )
            head = newNode;
        else
            tail.setNext(newNode);
        tail = newNode;
        size++;
    }

//Règle 2 : Gestion des exceptions

    public class Divisionexception {
        public static void main(java.lang.String[] args) {
            int i = 3;
            int j = 0;
            System.out.println("résultat = " + (i / j));
        }
    }


//Correction
    public class Divisionexception {
        public static void main(java.lang.String[] args) {
            int i = 3;
            int j = 0;
            try {
                 System.out.println("résultat = " + (i / j));
                } catch (ArithmeticException e) {
                System.out.println("Erreur, division par zéro pas possible");
            }
//Règle 3 : Faire une seule chose dans une fonction
            public Integer MoyenneetRendu(){
                int a = 20;
                int b = 20;
                int c = 0;
                c = (a + b) / 2;
                return c;
            }


// COrrection
            public void moyenne(){
                int a = 20;
                int b = 20;
                int c = 0;
                c = (a + b) / 2;
            }

            public Integer getMoyenne(){
                return c;
            }

//Règle 4 : Pas de retour null

            public Integer multiplication(Integer a){
                if(a!=null){
                    a*=5;
                }
                return a;
            }

//Correction
            public Integer (String a){
                if(a!=null){
                    a*=5;
                    return a;
                }
             System.out.println("Valeur nulle");

            }

            public Optional<Integer> multiplication(Integer a){
                if(a!=null){
                    a*=5;

                }
               return Optional.ofNullable(a);
            }
//Règle 5 Don't DRY


            public rotation(Integer a, Integer b){
                a=*1.2;
                b=*1.2;
            }
              public rotation2(Integer a, Integer b){
                a=*1.5;
                b=*1.5;
            }
    //Correction

            public rotation(Integer a, Integer b, Double c){
                a=*c;
                b=*c;
            }




        }
