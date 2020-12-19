


//code for data file 



public Button btna;
StorageReference reference;



@Override
void onCreate(Bundle savedState){
  super.onCreate(savedState);
  setContentView(R.layout.activity_main);
  btna = findViewById(R.id.btn);


reference = FirebaseStorage.getInstance().getReference().child("Document");
btna.setOnClickListener( new View.onClickListener(){
  @Override
  public void onClick(View v){

  String data =
 "1.
  course Number 101
  course Name: English
  course Field: English Composition
  professor Name: Bob Parker

  2.
  course Number 201
  course Name: College Algebra
  course Field: Mathematics
  professor Name: Henry Wilson

  3.
  course Number 106
  course Name: History
  course Field: American History
  professor Name: Dan Daniel

  4.
  course Number 301
  course Name: Chemistry
  course Field: Scientific World
  professor Name: Wade Connors

  5.
  course Number 110
  course Name: Elementary Italian
  course Field: Creative Expression
  professor Name: Jonas Jones

  6.
  course Number 103
  course Name: Theater
  course Field: Creative Expression
  professor Name: Rob Bennet

  7.
  course Number 131
  course Name: Into to Anthropology
  course Field: Scientific World
  professor Name: Thomas Heart

  8.
  course Number 221
  course Name: Discrete Mathematics
  course Field: Mathematics
  professor Name: Dave Grey

  9.
  course Number 151
  course Name: Intro to Computer Science
  course Field: Computer Science
  professor Name: Leo Richards

  10.
  course Number 220
  course Name: Writing about Literature
  course Field: English Composition
  professor Name: Tod Baker ";

  reference.child("file.txt").putBytes(data.getBytes()).addOnSuccessListener(new addOnSuccessListener<UploadTask.TaskSnapshot taskSnashot>);
      @Override
      public void onSuccess(UploadTask.TaskSnapshot taskSnapshot){
          Toast.makeText( context: MainActivity.this, text: "File Uploaded Successfully", Toast.LENGTH_SHORT).show();
      }).addOnFailureListener(new addOnFailureListener(){
        @Override
        public void onFailure(@Nonnull Exception e){
          Toast.makeText( context: MainActivity.this, e.toString(), Toast.LENGTH_SHORT.show();
        }
      });

    }
