# Create a function called palindrome
def palindrome ():
    # gets a word from user
    user_word = input("Enter a word: ")
    # take input and reverses it
    new_word = user_word[::-1]
    # checks to see if word reversed is the same as the original word. If so, it prints that it is a palindrome.
    if new_word == user_word:
        print("This is a palindrome!")
    # Prints that it is not a palidrome if the word isn't the same backwards.
    else:
        print("This is not a palindrome.")
        
# Calls function
palindrome()
