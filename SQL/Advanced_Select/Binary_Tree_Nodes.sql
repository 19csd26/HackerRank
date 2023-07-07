SELECT N, 
CASE WHEN P IS NULL THEN "Root"
WHEN NOT EXISTS (SELECT inner_table.P FROM BST AS inner_table WHERE inner_table.P = outer_table.N) THEN "Leaf"
ELSE "Inner"
END AS NodeType
FROM BST AS outer_table
ORDER BY N ASC;
