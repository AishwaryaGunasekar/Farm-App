SELECT *FROM farmers JOIN crops ON farmers.farmer_id = crops.crop_id;

SELECT *FROM fields RIGHT JOIN field_crops  ON fields.field_id = field_crops.field_id
RIGHT JOIN crops  ON field_crops.crop_id = crops.crop_id;

SELECT * FROM fields INNER JOIN field_livestock  ON fields.field_id = field_livestock.field_id
INNER JOIN livestock  ON field_livestock.livestock_id = livestock.livestock_id;

SELECT field_crops.crop_id, COUNT(*) AS total_harvests
FROM field_crops 
JOIN harvests  ON field_crops.field_id = harvests.field_id AND field_crops.crop_id = harvests.crop_id
GROUP BY field_crops.crop_id;

SELECT harvests.field_id, SUM(harvests.harvested_quantity) AS total_harvested_quantity
FROM harvests 
GROUP BY harvests.field_id;

SELECT field_crops.crop_id, AVG(harvests.harvested_quantity) AS average_harvested_quantity
FROM field_crops 
JOIN harvests  ON field_crops.field_id = harvests.field_id AND field_crops.crop_id = harvests.crop_id
GROUP BY field_crops.crop_id;


SELECT field_crops.crop_id, SUM(sales.sale_quantity * sales.sale_price) AS total_revenue
FROM field_crops 
JOIN sales  ON field_crops.crop_id = sales.crop_id
GROUP BY field_crops.crop_id;

SELECT crop_id, SUM(harvested_quantity) AS total_harvested
FROM harvests
GROUP BY crop_id
HAVING SUM(harvested_quantity) > 1100;

SELECT field_id, COUNT(DISTINCT crop_id) AS unique_crops
FROM field_crops
GROUP BY field_id
HAVING COUNT(DISTINCT crop_id) > 0;

SELECT livestock_type, SUM(livestock_quantity) AS total_quantity
FROM livestock
GROUP BY livestock_type
HAVING SUM(livestock_quantity) > 50;


DELETE FROM farmers WHERE farmer_id = 1;

SELECT farmers.farmer_name, crops.crop_name, harvests.harvested_quantity
FROM farmers 
JOIN fields  ON farmers.farmer_id = fields.field_id
JOIN field_crops  ON fields.field_id = field_crops.field_id
JOIN crops  ON field_crops.crop_id = crops.crop_id
JOIN harvests  ON field_crops.field_id = harvests.field_id AND field_crops.crop_id = harvests.crop_id;

select * from crops;
select * from harvests;







