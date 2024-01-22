print("Ex1:")
Andersen = {"The Emperor’s New Clothes", "The Little Mermaid", "The Little Match Girl", "The Snow Queen"}
print("Andersen:")
print(Andersen)

print("\nEx2:")
Shakespeare = {"Romeo and Juliet","Hamlet", "King Lear", "Macbeth", "A Midsummer Night’s Dream", "A Comedy of Errors"}
print("Shakespeare:")
print(Shakespeare)

print("\nEx3:")
Tragedy = {"Romeo and Juliet","Hamlet", "King Lear", "Macbeth", "Medea", "Octavia", "Oedipus", "Ur-Hamlet"}
Comedy ={"The Emperor’s New Clothes","The Three Musketeer", "The Clouds", "A Midsummer Night’s Dream", "A Comedy of Errors"}
Uncategory={"The Emperor’s New Clothes", "The Little Mermaid", "The Little Match Girl", "The Snow Queen", "Don Quixote", "Rapunzel", "Cinderella"}
print("Tragedy:")
print(Tragedy)
print("Comedy:")
print(Comedy)
print("Uncategory:")
print(Uncategory)

print("\nEx4:")
Shakespeare_Tragedy= Shakespeare.intersection(Tragedy)
print("Shakespeare_Tragedy:")
print(Shakespeare_Tragedy)

print("\nEx5:")
Andersen_Comedy= Andersen.intersection(Comedy)
print("Andersen_Comedy:")
print(Andersen_Comedy)

print("\nEx6:")
print("Andersen_Comedy and Shakespeare are disjoint?", Andersen_Comedy.isdisjoint(Shakespeare))
print("Andersen_Comedy and Andersen are disjoint?", Andersen_Comedy.isdisjoint(Andersen))
print("Andersen_Comedy and Tragedy are disjoint?", Andersen_Comedy.isdisjoint(Tragedy))
print("Andersen_Comedy and Comedy are disjoint?", Andersen_Comedy.isdisjoint(Comedy))
print("Andersen_Comedy and Uncategory are disjoint?", Andersen_Comedy.isdisjoint(Uncategory))
print("---------------------------------------------")
print("Andersen_Comedy and Shakespeare are issubset?", Andersen_Comedy.issubset(Shakespeare))
print("Andersen_Comedy and Andersen are issubset?", Andersen_Comedy.issubset(Andersen))
print("Andersen_Comedy and Tragedy are issubset?", Andersen_Comedy.issubset(Tragedy))
print("Andersen_Comedy and Comedy are issubset?", Andersen_Comedy.issubset(Comedy))
print("Andersen_Comedy and Uncategory are issubset?", Andersen_Comedy.issubset(Uncategory))
print("---------------------------------------------")
print("Andersen_Comedy and Shakespeare are issuperset?", Andersen_Comedy.issuperset(Shakespeare))
print("Andersen_Comedy and Andersen are issuperset?", Andersen_Comedy.issuperset(Andersen))
print("Andersen_Comedy and Tragedy are issuperset?", Andersen_Comedy.issuperset(Tragedy))
print("Andersen_Comedy and Comedy are issuperset?", Andersen_Comedy.issuperset(Comedy))
print("Andersen_Comedy and Uncategory are issuperset?", Andersen_Comedy.issuperset(Uncategory))
print("---------------------------------------------")
print("Shakespeare_Tragedy and Shakespeare are disjoint?", Shakespeare_Tragedy.isdisjoint(Shakespeare))
print("Shakespeare_Tragedy and Andersen are disjoint?", Shakespeare_Tragedy.isdisjoint(Andersen))
print("Shakespeare_Tragedy and Tragedy are disjoint?", Shakespeare_Tragedy.isdisjoint(Tragedy))
print("Shakespeare_Tragedy and Comedy are disjoint?", Shakespeare_Tragedy.isdisjoint(Comedy))
print("Shakespeare_Tragedy and Uncategory are disjoint?", Shakespeare_Tragedy.isdisjoint(Uncategory))
print("---------------------------------------------")
print("Shakespeare_Tragedy and Shakespeare are issubset?", Shakespeare_Tragedy.issubset(Shakespeare))
print("Shakespeare_Tragedy and Andersen are issubset?", Shakespeare_Tragedy.issubset(Andersen))
print("Shakespeare_Tragedy and Tragedy are issubset?", Shakespeare_Tragedy.issubset(Tragedy))
print("Shakespeare_Tragedy and Comedy are issubset?", Shakespeare_Tragedy.issubset(Comedy))
print("Shakespeare_Tragedy and Uncategory are issubset?", Shakespeare_Tragedy.issubset(Uncategory))
print("---------------------------------------------")
print("Shakespeare_Tragedy and Shakespeare are issuperset?", Shakespeare_Tragedy.issuperset(Shakespeare))
print("Shakespeare_Tragedy and Andersen are issuperset?", Shakespeare_Tragedy.issuperset(Andersen))
print("Shakespeare_Tragedy and Tragedy are issuperset?", Shakespeare_Tragedy.issuperset(Tragedy))
print("Shakespeare_Tragedy and Comedy are issuperset?", Shakespeare_Tragedy.issuperset(Comedy))
print("Shakespeare_Tragedy and Uncategory are issuperset?", Shakespeare_Tragedy.issuperset(Uncategory))

print("\nEx7:")
Works= set.union(Andersen, Shakespeare, Andersen_Comedy, Shakespeare_Tragedy, Tragedy, Comedy, Uncategory)
print("Works:")
print(Works)

print("\nEx8:")
Authors= {"Andersen", "Shakespeare", "Unknown"}
print("Authors:")
print(Authors)

print("\nEx9:")
Author_Of = dict.fromkeys(Works.intersection(Shakespeare), "Shakespeare")
Author_Of.update(dict.fromkeys(Works.intersection(Andersen), "Andersen"))
Author_Of.update(dict.fromkeys(Works.difference(Shakespeare.union(Andersen)), "Unknown"))
print("Author_Of:")
print(Author_Of)
print("Author of Hamlet: " + Author_Of["Hamlet"])

print("\nEx10:")
Writen_By = {}
for k, v in Author_Of.items():
    Writen_By[v] = Writen_By.get(v, []) + [k]
print("Writen_By:")
print(Writen_By)
print("Writen by Andersen: ")
print(Writen_By["Andersen"])

print("\nEx12:")
Lab="In the span of humanity, writing are what enabled humans to pass on many knowledge to their next generation./nVia writing, the art of telling stories; both fictional and real; evolved and became a huge part of humanity culture. \nAmong them, there are stories that transcend languages, culture and history to reach people far away both in spaces and times.\nSome prominent examples are the works of Shakespeare, Andersen, Homer,... \n1. Han Christian Andersen is famous for fairy tales such as: The Emperor’s New Clothes, The Little Mermaid, The Little Match Girl, The Snow Queen. Create a set in Python named Andersen and put his fairy tales’ names as elements. \n2. Shakespeare is mostly famous for his tragedy such as: Romeo and Juliet,Hamlet, King Lear, Macbeth. Meanwhile, he also wrote comedy such as:A Midsummer Night’s Dreamand A Comedy of Errors. Create a set in Python named Shakespeare and put his plays’ names as elements.\n3. Given the tragedies such as: Medea, Octavia, Oedipus,Ur-Hamlet. Comedies such as: The Three Musketeer, The Clouds and those mentioned in . Meanwhile there are some stories that is hard to put in either comedies or tragedies such as: Don Quixote, Rapunzel, Cinderella. Create 3 set named Tragedy, Comedy and Uncategory and put the above works, included Andersen and Shakespeare’s works, names in the right category. \n4. Create a set named Shakespeare_Tragedy by taking the difference of 2 related set.\n5. Create a set named Andersen_Comedy by taking the difference of 2 related sets.\n6. Determine the relationship of Andersen_Comedy and Shakespeare_Tragedy with Shakespeare, Andersen, Tragedy, Comedy, and Uncategory set. The relations needed to be test is: issubset, issuperset, isdisjoint.\n7. Create a set named Work by combine all the above set.\n8. Create a set named Author taking authors’ names and ’Unknown’ as it’s elements. \n9. Using python Dict named Author_Of to represent the relation between Work and Author. Which mean, print(Author_Of[’Hamlet’]) should print Shakespeare. \n10. Using python Dict named Writen_By to represent the invert relation of Author_Of. \n11. Using python Dict named Work_Count to count how many sets each Work appeared. \n12. Within the content of Exercise section count how many words are in this section of the Lab. \n13. Count how many times each words appeared and sorted the word by number of times they appeared descending."
print(Lab)
Words_in_Lab = len(Lab.split())
print("Words in Lab:"+str(Words_in_Lab))

print("\nEx13:")
words = []
words = Lab.split()
wfreq=[words.count(w) for w in words]
words_count =dict(zip(words,wfreq))
sort = {k: v for k, v in sorted(words_count.items(), key=lambda item: item[1])}
print(str(sort).replace(', ',',\n '))
