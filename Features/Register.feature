Feature: Register

Scenario: Register on TestMeApp 
Given Open TestMeApp
When click on signup 
And enter username as "Indra123"
And enter first name as "Indra"
And enter second name as "The Tiger"
And enter password as "Indrajit123"
And enter confirm password as "Indrajit123"
And enter gender
And enter email as "indra@gmail.com"
And enter Mobile Number as "9955990599"
And enter DOB as "06/19/1997"
And address as "Hinjewadi Pune"
And Security Question as "What is your Birth Place?"
And Answer as "Kolkata"
And click on Register


@login
Scenario: Login using datatable
Given Open TestMeApp
When click on signIn
And enter user credential
|lalitha|
|Password123|