SELECT E.ID, E.GENOTYPE, P.GENOTYPE PARENT_GENOTYPE
FROM ECOLI_DATA E 
JOIN ECOLI_DATA P ON E.PARENT_ID = P.ID
WHERE (E.GENOTYPE & P.GENOTYPE) = P.GENOTYPE
ORDER BY E.ID;