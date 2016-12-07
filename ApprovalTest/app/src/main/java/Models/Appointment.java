/**
 * Copyright 2005-2013 Restlet S.A.S.
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: Apache 2.0 or LGPL 3.0 or LGPL 2.1 or CDDL 1.0 or EPL
 * 1.0 (the "Licenses"). You can select the license that you prefer but you may
 * not use this file except in compliance with one of these Licenses.
 * 
 * You can obtain a copy of the Apache 2.0 license at
 * http://www.opensource.org/licenses/apache-2.0
 * 
 * You can obtain a copy of the LGPL 3.0 license at
 * http://www.opensource.org/licenses/lgpl-3.0
 * 
 * You can obtain a copy of the LGPL 2.1 license at
 * http://www.opensource.org/licenses/lgpl-2.1
 * 
 * You can obtain a copy of the CDDL 1.0 license at
 * http://www.opensource.org/licenses/cddl1
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://www.restlet.com/products/restlet-framework
 * 
 * Restlet is a registered trademark of Restlet S.A.S.
 */

package Models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;



/**
* Generated by the generator tool for the OData extension for the Restlet framework.<br>
*
* @see <a href="http://localhost:7000/OpenResKitHub/$metadata">Metadata of the target OData service</a>
*
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class Appointment implements Comparable<Appointment>{
	
	@JsonProperty("Id")
    private int id;
	
	@JsonProperty("Begin")
	private Date begin;
	
	@JsonProperty("End")
	private Date end;
	
	@JsonProperty("IsAllDay")
    private boolean isAllDay;

	@Override
	public int compareTo(Appointment a) {
		// TODO Auto-generated method stub
		return this.begin.compareTo(a.begin);
	}
	
	/**
     * Constructor without parameter.
     * 
     */
    public Appointment() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The identifiant value of the entity.
     */
    public Appointment(int id) {
        this();
        this.id = id;
    }

   /**
    * Returns the value of the "begin" attribute.
    *
    * @return The value of the "begin" attribute.
    */
   public Date getBegin() {
      return begin;
   }
   /**
    * Returns the value of the "end" attribute.
    *
    * @return The value of the "end" attribute.
    */
   public Date getEnd() {
      return end;
   }
   /**
    * Returns the value of the "id" attribute.
    *
    * @return The value of the "id" attribute.
    */
   public int getId() {
      return id;
   }
   /**
    * Returns the value of the "isAllDay" attribute.
    *
    * @return The value of the "isAllDay" attribute.
    */
   public boolean getIsAllDay() {
      return isAllDay;
   }
   /**
    * Sets the value of the "begin" attribute.
    *
    * @param begin
    *     The value of the "begin" attribute.
    */
   public void setBegin(Date begin) {
      this.begin = begin;
   }
   /**
    * Sets the value of the "end" attribute.
    *
    * @param end
    *     The value of the "end" attribute.
    */
   public void setEnd(Date end) {
      this.end = end;
   }
   /**
    * Sets the value of the "id" attribute.
    *
    * @param id
    *     The value of the "id" attribute.
    */
   public void setId(int id) {
      this.id = id;
   }
   /**
    * Sets the value of the "isAllDay" attribute.
    *
    * @param isAllDay
    *     The value of the "isAllDay" attribute.
    */
   public void setIsAllDay(boolean isAllDay) {
      this.isAllDay = isAllDay;
   }


}