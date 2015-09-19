package Lab1;

public class Passenger{
        private String name;
        private byte service;

        public Passenger(String newName, byte newService){
               name = newName;
               service = newService;
            }

        public void setName(String newName){
                if(newName != null && newName.matches("[a-z]")){
                        name = newName;
                    }

                else{
                    name = "Hello";   
                 }
            }

        public void setService( byte newService){
                if(service == 1 || service == 2){
                        service = newService;
                    }

                else{
                    service = 1;    
                 }
            }
        
        public String getName(){
                return name;
            }

        public byte getService(){
                return service;
            }
        
        public String toString(){
                return name + " " + service;
            }

        public boolean equals(Object o){
                if( ! ( o instanceof Passenger) ){
                    return false;
                }
                else{
                    Passenger p = (Passenger) o;
                    
                    if( p.getName().equals(name) && p.getService() == service ){
                            return true;
                        }

                    else{
                        return false;
                    }
                }
            } 
    }
