<html>

<head>
<style>

html, body{
	font-family:Verdana, Arial, Helvetica, sans-serif;
	background: #FAF0E6
}

</style>

</head>

<body>

<h3>University Management System REST API</h3>

<p> <strong>REST API designed by Ashique Mohaimin Ornab</strong> </p>

<p>Tools and technologies used - </p>
<ul>
<li>Programming Language : Java, HTML, CSS, JSP, JSTL</li>
<li>Frameworks : Spring Web MVC, Spring REST and Hibernate ORM</li>
<li>Data Binding : Jackson</li>
<li>Project Management Tool : Maven</li>
<li>Database : MySQL</li>
<li>Cloud computing platform : Amazon Web Services</li>
</ul>

<hr>

<table>

<tr>
<th>HTTP Method</th>
<th>ENDPOINT</th>
<th>CRUD ACTION</th>
</tr>

<tr>
<td>GET</td>
<td><a href = http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/instructors>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/instructors</a></td>
<td>Read a list of instructors</td>
</tr>

<tr>
<td>GET</td>
<td>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/instructors/{intructorId}</td>
<td>Read a single instructor</td>
</tr>

<tr>
<td>POST</td>
<td>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/instructors</td>
<td>Create an instructor</td>
</tr>

<tr>
<td>PUT</td>
<td>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/instructors</td>
<td>Update existing instructor</td>
</tr>

<tr>
<td>DELETE</td>
<td>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/instructors/{instructorId}</td>
<td>Delete an instructor</td>
</tr>

<tr>
<td>GET</td>
<td>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/instructors/courses/{instructorId}</td>
<td>Read all courses of an instructor</td>
</tr>

<tr>
<td>DELETE</td>
<td>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/instructors/courses/{courseId}</td>
<td>Delete a course of the instructor</td>
</tr>

<tr>
<td>GET</td>
<td><a href = http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/instructors/courses/add>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/instructors/courses/add</a></td>
<td>Read a list of courses that have no instructors</td>
</tr>

<tr>
<td>POST <br><hr></td>
<td>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/instructors/courses/add/{courseId}/{instructorId} <br><hr></td>
<td>Add a course for the instructor <br><hr></td>
</tr>


<tr>
<td>GET</td>
<td><a href = http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/students>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/students</a></td>
<td>Read a list of all students</td>
</tr>

<tr>
<td>GET</td>
<td>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/students/{studentId}</td>
<td>Read a single student</td>
</tr>

<tr>
<td>POST</td>
<td>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/students</td>
<td>Create a new student</td>
</tr>

<tr>
<td>PUT</td>
<td>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/students</td>
<td>Update an existing student</td>
</tr>

<tr>
<td>DELETE</td>
<td>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/students/{studentId}</td>
<td>Delete an existing student</td>
</tr>

<tr>
<td>GET</td>
<td>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/students/courses/{studentId}</td>
<td>Read all courses of a student</td>
</tr>

<tr>
<td>DELETE</td>
<td>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/students/courses/{courseId}/{studentId}</td>
<td>Delete a course of the student</td>
</tr>

<tr>
<td>GET</td>
<td>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/students/courses/add/{studentId}</td>
<td>Read a list of courses that the student did not take</td>
</tr>

<tr>
<td>POST <br><hr></td>
<td>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/students/courses/add/{courseId}/{studentId} <br><hr></td>
<td>Add a course for the student <br><hr></td>
</tr>

<tr>
<td>GET</td>
<td><a href = http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/courses>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/courses</a></td>
<td>Read all courses</td>
</tr>

<tr>
<td>GET</td>
<td>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/courses/{courseId}</td>
<td>Read a single course</td>
</tr>

<tr>
<td>POST</td>
<td>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/courses</td>
<td>Create a new course</td>
</tr>

<tr>
<td>PUT</td>
<td>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/courses</td>
<td>Update an existing course</td>
</tr>

<tr>
<td>DELETE</td>
<td>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/courses/{courseId}</td>
<td>Delete an existing course</td>
</tr>

<tr>
<td>GET</td>
<td>http://universitymanagementsystemrestapi-env.eba-3pxjw94a.us-west-2.elasticbeanstalk.com/api/courses/students/{courseId}</td>
<td>Read all students of a course</td>
</tr>

</table>


</body>

<footer>
  <p>Developer: Ashique Mohaimin Ornab</p>
  <p><a href="mailto:hege@example.com">amornab@gmail.com</a></p>
</footer> 

</html>