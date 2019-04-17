/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: eventmessage_0
//!	Generated Date	: Tue, 16, Apr 2019 
	File Path	: EXE/Host/com/telelogic/dishwasher/eventmessage_0.java
*********************************************************************/

package com.telelogic.dishwasher;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// com/telelogic/dishwasher/eventmessage_0.java                                                                  
//----------------------------------------------------------------------------

//## package com::telelogic::dishwasher 


//## event eventmessage_0() 
public class eventmessage_0 extends RiJEvent implements AnimatedEvent {
    
    public static final int eventmessage_0_dishwasher_telelogic_com_id = 6621;		//## ignore 
    
    
    // Constructors
    
    public  eventmessage_0() {
        lId = eventmessage_0_dishwasher_telelogic_com_id;
    }
    
    public boolean isTypeOf(long id) {
        return (eventmessage_0_dishwasher_telelogic_com_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("com.telelogic.dishwasher.eventmessage_0");
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
          String s="eventmessage_0(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/com/telelogic/dishwasher/eventmessage_0.java
*********************************************************************/

