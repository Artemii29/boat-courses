1
SELECT go.dateOut b.name f.type
FROM GoingOut go
JOIN Boat b on go.boat_id = b_id
JOIN Fish f on go.fish_id = f_id
2
SELECT name AS boat_name,displacement * FROM BOAT
GROUP BY name
4
SELECT f.type go.dateOut go.dateReturn
COUNT(f) as catchCount
FROM Fish f
JOIN GoingOut go on go.fish_id = f.id
GROUP BY f.type, go.dateOut, go.dateReturn
3
SELECT b.name go.fish from Boat b
JOIN GoingOut go on b.id = go.boat_id
WHERE go.fish > :value
