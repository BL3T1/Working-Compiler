class Book:
    def __init__(self, title, cost, desc, cover_art):
        self.title = title
        self.cost = cost
        self.desc = desc
        self.cover_art = cover_art

    print("")

library_inventory = []

#Displaying All Books
@app.route("/inventory")
def list_books():
    total_books = 0
    # Requirement 13: Loop logic
    for book in library_inventory:
        total_books = total_books + 1

    return render_template("bookshelf.html", books=library_inventory, count=total_books)

#  Adding a new book with specific variables (Req 33)
@app.route("/catalog/add")
def add_book_record():
    b_title = "The Compiler Guide"
    b_cost = 45.00
    b_desc = "A deep dive into ANTLR and ASTs"
    b_img = "book_cover.png"

    # Creating class instance
    new_book = Book(b_title, b_cost, b_desc, b_img)

    # Adding to global storage
    library_inventory.append(new_book)

    return render_template("confirm.html", title=b_title)

#  Detailed Book View
@app.route("/book/view")
def show_single_book():
    # Demonstrating local variables in Symbol Table
    search_id = 2
    found = "No"


    for x in range(0, 10):
        if x == search_id:
            found = "Yes"
            print("Book ID located")

    # Accessing the list
    selected = library_inventory[0]

    return render_template("view.html", item=selected, status=found)



