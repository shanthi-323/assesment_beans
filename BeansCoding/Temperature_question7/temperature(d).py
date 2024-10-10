# Daily temperatures and corresponding days
daily_temperatures = [32, 30, 31, 29, 33, 34, 32]
days_of_week = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]

# Calculate sum, max, min and corresponding days
sum_temp = sum(daily_temperatures)
max_temp = max(daily_temperatures)
min_temp = min(daily_temperatures)
average_temp = sum_temp / len(daily_temperatures)

max_day = days_of_week[daily_temperatures.index(max_temp)]
min_day = days_of_week[daily_temperatures.index(min_temp)]

# Write the report to a file
with open("TemperatureReport.txt", "w") as file:
    file.write("Daily Temperature Report\n")
    for i in range(len(daily_temperatures)):
        file.write(f"{days_of_week[i]}: {daily_temperatures[i]}\n")

    file.write(f"\nAverage Temperature: {average_temp}\n")
    file.write(f"Maximum Temperature: {max_temp} (on {max_day})\n")
    file.write(f"Minimum Temperature: {min_temp} (on {min_day})\n")
