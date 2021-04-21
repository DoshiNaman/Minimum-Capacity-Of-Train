# Minimum-Capacity-Of-Train
Find the minimum capacity of the train required to hold the passengers

Given the number of passengers entering and exiting the train, the task is to find the minimum capacity of the train to keep all the passengers in throughout the journey.

Examples:

Input: enter[] = {3, 5, 2, 0}, exit[] = {0, 2, 4, 4}
Output: 6
Station 1: Train capacity = 3
Station 2: Train capacity = 3 + 5 – 2 = 6
Station 3: Train capacity = 6 + 2 – 4 = 4
Station 4: Train capacity = 4 – 4 = 0
The maximum passengers that can be in the
train at any instance of time is 6.

Input: enter[] = {5, 2, 2, 0}, exit[] = {0, 2, 2, 5}
Output: 5

Approach: 
  The current capacity of the train at a particular station can be calculated by adding the number of people entering the train and subtracting the number of people exiting the train. The minimum capacity required will be the maximum of all the values of current capacities at all the stations.
