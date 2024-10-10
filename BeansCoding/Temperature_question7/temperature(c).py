daily_temperatures = [32, 30, 31, 29, 33, 30, 32]

# Calculate sum, max, and min
sum_temp = sum(daily_temperatures)
max_temp = max(daily_temperatures)
min_temp = min(daily_temperatures)

# Calculate average
average_temp = sum_temp / len(daily_temperatures)

# Print results
print(f"Average temperature: {average_temp}")
print(f"Maximum temperature: {max_temp}")
print(f"Minimum temperature: {min_temp}")
