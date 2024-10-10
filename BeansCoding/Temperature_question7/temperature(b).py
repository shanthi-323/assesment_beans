# Array to store temperatures for the week
daily_temperatures_ = [None] * 7
days_of_week = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]

# Automatically updating the temperature for each day with user input
for i in range(len(daily_temperatures_)):
    temp = int(input(f"Enter temperature for {days_of_week[i]}: "))  # Prompt the user for input
    daily_temperatures_[i] = temp  # Update the temperature

# Print the updated temperatures
print("Updated temperatures for the week:")
for i in range(len(daily_temperatures_)):
    print(f"{days_of_week[i]}: {daily_temperatures_[i]}")
