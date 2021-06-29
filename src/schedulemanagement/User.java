/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulemanagement;

/**
 *
 * @author shanu
 */
class User {
    private String name, date , module ,time , hall, batch;
    private int ID;
    
    
    public User( int ID, String name, String date, String module, String time , String hall, String batch){
        this.ID = ID;
        this.name = name;
        this.date = date;
        this.module = module;
        this.time = time;
        this.hall = hall;
        this.batch = batch;
                
    }
    
    
    public int getID(){
        return ID;
    }
   public String getName(){
       return name;
   }
   public String getDate(){
       return date;
   }
    public String getModule(){
       return module;
   }
    public String getTime(){
        return time;
    }
    public String getHall() {
        return hall;
    }
    public String getBatch(){
        return batch;
    }
    public void setName(String name){
        this.name = name;
    }
}
