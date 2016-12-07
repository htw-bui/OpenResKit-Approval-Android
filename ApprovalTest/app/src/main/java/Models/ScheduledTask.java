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
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
/**
* Generated by the generator tool for the OData extension for the Restlet framework.<br>
*
* @see <a href="http://localhost:7000/OpenResKitHub/$metadata">Metadata of the target OData service</a>
*
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="odata.type")
@JsonSubTypes({

    //@JsonSubTypes.Type(value=FillLevelReading.class, name="OpenResKit.DomainModel.FillLevelReading"),
    //@JsonSubTypes.Type(value=MeterReading.class, name="OpenResKit.DomainModel.MeterReading"),
	@JsonSubTypes.Type(value=Inspection.class, name="OpenResKit.DomainModel.Approval_Inspection"),
   
})
public abstract class ScheduledTask {

	@JsonProperty("Id")
	private int id;
	
	@JsonProperty("Progress")
    private double progress;
		
	@JsonProperty("AppointmentResponsibleSubject")
    private ResponsibleSubject appointmentResponsibleSubject;
	
	@JsonProperty("DueDate")
    private Appointment dueDate;
    
	@JsonProperty("EntryDate")
    private Appointment entryDate;
	
	@JsonProperty("EntryResponsibleSubject")
    private ResponsibleSubject entryResponsibleSubject;
	
	@JsonIdentityInfo(scope=Series.class, generator=ObjectIdGenerators.IntSequenceGenerator.class)
	@JsonProperty("RelatedSeries")
    private Series relatedSeries;

    /**
     * Constructor without parameter.
     * 
     */
    public ScheduledTask() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The identifiant value of the entity.
     */
    public ScheduledTask(int id) {
        this();
        this.id = id;
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
    * Returns the value of the "progress" attribute.
    *
    * @return The value of the "progress" attribute.
    */
   public double getProgress() {
      return progress;
   }
   /**
    * Returns the value of the "appointmentResponsibleSubject" attribute.
    *
    * @return The value of the "appointmentResponsibleSubject" attribute.
    */
   public ResponsibleSubject getAppointmentResponsibleSubject() {
      return appointmentResponsibleSubject;
   }
   
   /**
    * Returns the value of the "dueDate" attribute.
    *
    * @return The value of the "dueDate" attribute.
    */
   public Appointment getDueDate() {
      return dueDate;
   }
   
   /**
    * Returns the value of the "entryDate" attribute.
    *
    * @return The value of the "entryDate" attribute.
    */
   public Appointment getEntryDate() {
      return entryDate;
   }
   
   /**
    * Returns the value of the "entryResponsibleSubject" attribute.
    *
    * @return The value of the "entryResponsibleSubject" attribute.
    */
   public ResponsibleSubject getEntryResponsibleSubject() {
      return entryResponsibleSubject;
   }
   
   /**
    * Returns the value of the "relatedSeries" attribute.
    *
    * @return The value of the "relatedSeries" attribute.
    */
   public Series getRelatedSeries() {
      return relatedSeries;
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
    * Sets the value of the "progress" attribute.
    *
    * @param progress
    *     The value of the "progress" attribute.
    */
   public void setProgress(double progress) {
      this.progress = progress;
   }
   /**
    * Sets the value of the "appointmentResponsibleSubject" attribute.
    *
    * @param appointmentResponsibleSubject"
    *     The value of the "appointmentResponsibleSubject" attribute.
    */
   public void setAppointmentResponsibleSubject(ResponsibleSubject appointmentResponsibleSubject) {
      this.appointmentResponsibleSubject = appointmentResponsibleSubject;
   }

   /**
    * Sets the value of the "dueDate" attribute.
    *
    * @param dueDate"
    *     The value of the "dueDate" attribute.
    */
   public void setDueDate(Appointment dueDate) {
      this.dueDate = dueDate;
   }

   /**
    * Sets the value of the "entryDate" attribute.
    *
    * @param entryDate"
    *     The value of the "entryDate" attribute.
    */
   public void setEntryDate(Appointment entryDate) {
      this.entryDate = entryDate;
   }

   /**
    * Sets the value of the "entryResponsibleSubject" attribute.
    *
    * @param entryResponsibleSubject"
    *     The value of the "entryResponsibleSubject" attribute.
    */
   public void setEntryResponsibleSubject(ResponsibleSubject entryResponsibleSubject) {
      this.entryResponsibleSubject = entryResponsibleSubject;
   }

   /**
    * Sets the value of the "relatedSeries" attribute.
    *
    * @param relatedSeries"
    *     The value of the "relatedSeries" attribute.
    */
   public void setRelatedSeries(Series relatedSeries) {
      this.relatedSeries = relatedSeries;
   }

}