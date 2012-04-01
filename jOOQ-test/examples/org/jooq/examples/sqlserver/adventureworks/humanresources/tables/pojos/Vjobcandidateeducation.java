/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "vJobCandidateEducation", schema = "HumanResources")
public class Vjobcandidateeducation implements java.io.Serializable {

	private static final long serialVersionUID = 306284813;

	private java.lang.Integer  jobcandidateid;
	private java.lang.String   eduLevel;
	private java.sql.Timestamp eduStartdate;
	private java.sql.Timestamp eduEnddate;
	private java.lang.String   eduDegree;
	private java.lang.String   eduMajor;
	private java.lang.String   eduMinor;
	private java.lang.String   eduGpa;
	private java.lang.String   eduGpascale;
	private java.lang.String   eduSchool;
	private java.lang.String   eduLocCountryregion;
	private java.lang.String   eduLocState;
	private java.lang.String   eduLocCity;

	@javax.persistence.Column(name = "JobCandidateID")
	public java.lang.Integer getJobcandidateid() {
		return this.jobcandidateid;
	}

	public void setJobcandidateid(java.lang.Integer jobcandidateid) {
		this.jobcandidateid = jobcandidateid;
	}

	@javax.persistence.Column(name = "Edu.Level")
	public java.lang.String getEduLevel() {
		return this.eduLevel;
	}

	public void setEduLevel(java.lang.String eduLevel) {
		this.eduLevel = eduLevel;
	}

	@javax.persistence.Column(name = "Edu.StartDate")
	public java.sql.Timestamp getEduStartdate() {
		return this.eduStartdate;
	}

	public void setEduStartdate(java.sql.Timestamp eduStartdate) {
		this.eduStartdate = eduStartdate;
	}

	@javax.persistence.Column(name = "Edu.EndDate")
	public java.sql.Timestamp getEduEnddate() {
		return this.eduEnddate;
	}

	public void setEduEnddate(java.sql.Timestamp eduEnddate) {
		this.eduEnddate = eduEnddate;
	}

	@javax.persistence.Column(name = "Edu.Degree")
	public java.lang.String getEduDegree() {
		return this.eduDegree;
	}

	public void setEduDegree(java.lang.String eduDegree) {
		this.eduDegree = eduDegree;
	}

	@javax.persistence.Column(name = "Edu.Major")
	public java.lang.String getEduMajor() {
		return this.eduMajor;
	}

	public void setEduMajor(java.lang.String eduMajor) {
		this.eduMajor = eduMajor;
	}

	@javax.persistence.Column(name = "Edu.Minor")
	public java.lang.String getEduMinor() {
		return this.eduMinor;
	}

	public void setEduMinor(java.lang.String eduMinor) {
		this.eduMinor = eduMinor;
	}

	@javax.persistence.Column(name = "Edu.GPA")
	public java.lang.String getEduGpa() {
		return this.eduGpa;
	}

	public void setEduGpa(java.lang.String eduGpa) {
		this.eduGpa = eduGpa;
	}

	@javax.persistence.Column(name = "Edu.GPAScale")
	public java.lang.String getEduGpascale() {
		return this.eduGpascale;
	}

	public void setEduGpascale(java.lang.String eduGpascale) {
		this.eduGpascale = eduGpascale;
	}

	@javax.persistence.Column(name = "Edu.School")
	public java.lang.String getEduSchool() {
		return this.eduSchool;
	}

	public void setEduSchool(java.lang.String eduSchool) {
		this.eduSchool = eduSchool;
	}

	@javax.persistence.Column(name = "Edu.Loc.CountryRegion")
	public java.lang.String getEduLocCountryregion() {
		return this.eduLocCountryregion;
	}

	public void setEduLocCountryregion(java.lang.String eduLocCountryregion) {
		this.eduLocCountryregion = eduLocCountryregion;
	}

	@javax.persistence.Column(name = "Edu.Loc.State")
	public java.lang.String getEduLocState() {
		return this.eduLocState;
	}

	public void setEduLocState(java.lang.String eduLocState) {
		this.eduLocState = eduLocState;
	}

	@javax.persistence.Column(name = "Edu.Loc.City")
	public java.lang.String getEduLocCity() {
		return this.eduLocCity;
	}

	public void setEduLocCity(java.lang.String eduLocCity) {
		this.eduLocCity = eduLocCity;
	}
}