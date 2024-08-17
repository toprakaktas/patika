import math

# 1. Define the points list with tuples representing 2D points.
points = [(1, 2), (3, 4), (5, 6), (7, 8), (2, 3), (4, 5)]

# 2. Define the euclideanDistance function.
def euclideanDistance(point1, point2):
    return math.sqrt((point2[0] - point1[0]) ** 2 + (point2[1] - point1[1]) ** 2)

# 3. Calculate distances between all pairs of points and store them in a distances list.
distances = []
for i in range(len(points)):
    for j in range(i + 1, len(points)):
        distance = euclideanDistance(points[i], points[j])
        distances.append(distance)

# 4. Find the minimum distance.
min_distance = min(distances)

# Display the minimum distance.
min_distance
