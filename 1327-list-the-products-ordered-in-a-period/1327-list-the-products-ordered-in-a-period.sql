# Write your MySQL query statement below
SELECT p.product_name, SUM(o.unit) AS unit 
FROM Products p
LEFT JOIN Orders o
ON p.product_id = o.product_id
WHERE extract(year_month FROM o.order_date) = 202002
GROUP BY o.product_id
HAVING SUM(o.unit) >= 100;

