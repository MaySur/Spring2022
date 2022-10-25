public class Obs{
        private Subject subject;    
        
        public Obs(Subject subject){
            this.subject = subject;
            this.subject.attach(this;)
            
        }
        public void update(int state){
            System.out.println(this.toString()+"new state : "+state);
        }
        public void setState(int state){
            subject.setState(state);
 
        }
        
    }
    

