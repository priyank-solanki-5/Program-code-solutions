sentence = "hello student i am study in darshan univarsity"
for word in sentence.split():
    for letter in set(word):
        if word.count(letter) > 2:
            print(word)
            break
