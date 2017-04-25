package id.al.bookinventory.database;

public class Reusable {
    public static final String DATABASE_NAME = "BooksCatalog";
    public static final int DATABASE_VERSION = 2;
    public static final String TABLE_BOOK = "Book";
    public static final String TABLE_CATEGORY = "Category";

    public static final String COL_DB_ID = "idx";
    //field baru
    public static final String COL_BOOK_ID = "book_id";
    public static final String COL_ISBN = "ISBN";
    public static final String COL_TITLE = "BookTitle";
    public static final String COL_AUTHOR = "BookAuthor";
    public static final String COL_YEAR = "PublishedYear";
    public static final String COL_CATEGORY = "BookCategory";
    public static final String COL_SYNOPSIS = "BookSynopsis";
    public static final String COL_IMG_COVER = "BookCover";

    public static final String COL_CATEGORY_ID = "CategoryId";
    public static final String COL_CATEGORY_NAME = "CategoryName";
    public static final String COL_CATEGORY_DESC = "CategoryDesc";

    //penambahan COL_BOOK_ID
    public static final String DATABASE_CREATE_BOOK =
            "CREATE TABLE " + TABLE_BOOK + "("
                    + COL_DB_ID + " INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT" + ","
                    + COL_BOOK_ID + " INTEGER " + ","
                    + COL_ISBN + " TEXT NOT NULL UNIQUE" + ","
                    + COL_TITLE + " TEXT NOT NULL " + ","
                    + COL_AUTHOR + " TEXT NOT NULL " + ","
                    + COL_YEAR + " INTEGER " + ","
                    + COL_CATEGORY + " INTEGER " + ","
                    + COL_SYNOPSIS + " TEXT " + ","
                    + COL_IMG_COVER + " TEXT);";
    public static final String DATABASE_CREATE_CATEGORY =
            "CREATE TABLE " + TABLE_CATEGORY + "("
                    + COL_CATEGORY_ID + " INTEGER NOT NULL PRIMARY KEY,"
                    + COL_CATEGORY_NAME + " TEXT NOT NULL " + ","
                    + COL_CATEGORY_DESC + " TEXT);";
    // penambahan kolom kedua untuk book_id
    public static final String DATABASE_INSERT_BOOK =
            "INSERT INTO " + TABLE_BOOK + " SELECT NULL, NULL, '9780439064873' AS ISBN, 'Beauty and the Beast' AS BookTitle, 'Bill Condon' AS BookAuthor,"
                    + " 2017 as PublishedYear, 1 as BookGenre, 'An adaptation of the fairy tale about a monstrous-looking prince and a young woman who fall in love.' as BookSynopsis, 'http://dx35vtwkllhj9.cloudfront.net/disney/beauty-and-the-beast/images/regions/gb/onesheet.jpg' as BookCover"
                    + " UNION SELECT NULL, NULL, '9780316015844','The Boss Baby','Tom McGrath', 2017, 3, 'A suit-wearing briefcase-carrying baby pairs up with his seven-year old brother to stop the dastardly plot of the CEO of Puppy Co.', 'http://frtopcinefilms.com/wp-content/uploads/2017/01/Baby-Boss-752x1024.jpg?COLLCC=2475976750&'"
                    + " UNION SELECT NUll, NULL, '9781484724989','Smurfs: The Lost Village','Kelly Asbury', 2017, 2, 'In this fully animated, all-new take on the Smurfs, a mysterious map sets Smurfette and her friends Brainy, Clumsy and Hefty on an exciting race through the Forbidden Forest leading to the discovery of the biggest secret in Smurf history.', 'http://www.newdvdreleasedates.com/images/posters/large/smurfs-the-lost-village-2017-06.jpg'";
    public static final String DATABASE_INSERT_CATEGORY =
            "INSERT INTO " + TABLE_CATEGORY + " SELECT 1 AS CategoryId, 'Fantasy' AS CategoryName, '-' AS CategoryDesc"
                    + " UNION SELECT 2 AS CategoryId, 'Science Fiction' AS CategoryName, '-' AS CategoryDesc"
                    + " UNION SELECT 3 AS CategoryId, 'Romance' AS CategoryName, '-' AS CategoryDesc";
}