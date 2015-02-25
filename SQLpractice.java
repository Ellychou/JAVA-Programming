SELECT max(salary) FROM Employee WHERE salary NOT IN (SELECT max(salary) FROM Employee);

SELECT DepID, MAX(salary) FROM Employee GROUP BY DepID;

SELECT GetDate();

SELECT IsDate('23/34/2990') AS "mm/dd/yy";

SELECT DISTINCT name FROM Employee WHERE DOB BETWEEN '0/01/1960' AND '31/12/1975';

SELECT COUNT(*),sex WHERE DOB BETWEEN '0/01/1960' AND '31/12/1975' GROUP BY sex;

SELECT * FROM Employee WHERE salary>=10000;

WHERE name LIKE 'M%';

SELECT Students.StudentID, StudentNmae, Count 
FROM (
	SELECT Students.StudentID, COUNT(StudentCourses.CourseID) AS Count
	FROM Students LEFT JOIN StudentCourses 
	ON Students.StudentID = StudentCourses.StudentID
	GROUP BY StudentID
)T JOIN Students ON T.StudentID = StudentCourses.StudentID

SELECT TeacherName, ISNULL(number)
FROM Students INNER JOIN
(
	SELECT TeacherID, COUNT(Courses.CourseID) AS number
	FROM Courses JOIN StudentCourses
	ON Courses.CourseID = StudentCourses.CourseID
	GROUP BY Courses.TeacherID
)StudentSize 
ON Teachers.TeacherID = StudentSize.TeacherID
ODER BY number DESC

Write a SQL query to find all numbers that appear at least three times consecutively.
SELECT Scores.score, COUNT(Ranking.Score) AS RANK
FROM Scores, (SELECT DISTINCT Score FROM Scores) Ranking
WHERE Scores.Score = Ranking.Score
ORDER BY Scores.score, Scores.Id DESC

Get student and courses they enrolled in 
SELECT StudentID, COUNT(StudentCourses.CourseID) AS count
FROM Students JOIN (SELECT S.StudentID,C.CourseID FROM Students S LEFT JOIN Courses C
				ON S.StudentID = C.StudentID GROUP BY StudentID) T ON T.StudentID = S.StudentID

SELECT C.TeacherID, COUNT(S.StudentID) AS number
FROM Courses C LEFT JOIN StudentCourses S
ON C.CourseID = S.CourseID
GROUP BY C.TeacherID
ORDER BY number DESC




































