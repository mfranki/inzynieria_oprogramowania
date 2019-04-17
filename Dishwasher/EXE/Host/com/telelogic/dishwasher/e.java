/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: e
//!	Generated Date	: Tue, 16, Apr 2019 
	File Path	: EXE/Host/com/telelogic/dishwasher/e.java
*********************************************************************/

package com.telelogic.dishwasher;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// com/telelogic/dishwasher/e.java                                                                  
//----------------------------------------------------------------------------

//## package com::telelogic::dishwasher 


//## event e() 
public class e extends RiJEvent implements AnimatedEvent {
    
    public static final int e_dishwasher_telelogic_com_id = 6620;		//## ignore 
    
    
    // Constructors
    
    public  e() {
        lId = e_dishwasher_telelogic_com_id;
    }
    
    public boolean isTypeOf(long id) {
        return (e_dishwasher_telelogic_com_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("com.telelogic.dishwasher.e");
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public Object getFieldValue(java.lang.reflect.Field f, Object userInstance) { 
         Object obj = null;
         try {
             obj = f.get(userInstance);
         } catch(Exception e) {
              java.lang.System.err.println("Exception: getting Field value: " + e);
              e.printStackTrace();
         }
         return obj;
    }
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public void addAttributes(AnimAttributes msg) {      
    }
    public String toString() {
          String s="e(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/com/telelogic/dishwasher/e.java
*********************************************************************/

