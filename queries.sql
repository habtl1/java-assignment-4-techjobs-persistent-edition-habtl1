-- Part 1: Test it with SQL
--ID(Integer)
--Employer(VARCHAR)
--Name(VARCHAR)
--Skill(VARCHAR)
-- Part 2: Test it with SQL
--"SELECT\\s+name\\s+FROM\\s+employer\\s+WHERE\\s+location\\s+=\\s+\"St.\\s+Louis\\s+City\";"
SELECT name FROM employer WHERE location = "St. Louis City";
-- Part 3: Test it with SQL
--"DROP\\s+TABLE\\s+job;"
DROP TABLE job;
-- Part 4: Test it with SQL
SELECT *
FROM skill
INNER JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;