select COUNT(*) COUNT
from ECOLI_DATA
where (GENOTYPE & 2) = 0 &&  (GENOTYPE & 1 > 0 || GENOTYPE & 4 > 0); 