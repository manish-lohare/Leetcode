SELECT id, movie, description, rating
FROM Cinema
WHERE id % 2 = 1 -- Select odd-numbered IDs
AND description <> 'boring' -- Exclude 'boring' movies
ORDER BY rating DESC; -- Sort by rating in descending order
