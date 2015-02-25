Customers Who Never Order
SELECT Name From Customers WHERE NOT EXISTS (SELECT Order.Id FROM Orders WHERE Customers.Id = Orders.CustomerId)
SELECT C.Name FROM Customers C LEFT JOIN Orders O ON C.Id = O.CustomerId WHERE O.Id IS NULL
SELECT Name From Customers C WHERE C.Id NOT IN (SELECT CustomerId FROM Orders)

Write a SQL query to find all duplicate emails in a table named Person.
SELECT Email FROM Person GROUP BY Email HAVING COUNT(Email) > 1

Employees Earning More Than Their Managers 
SELECT e.Name FROM Employee e, Employee a WHERE e.Salary > a.Salary AND e.Id = a.ManagerId

Nth Highest Salary
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
DECLARE M INT;
SET M = N-1;
  RETURN (
      # Write your MySQL query statement below.
      SELECT DISTINCT Salary FROM Employee ORDER BY Salary DESC LIMIT M,1
  );
END