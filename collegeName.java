



String data1 = " 1.
College Code: 002690
College Name: Queens College

2.
College Code: 002689
College Name: Hunter College

3.
College Code: 002688
College Name: City College

4.
College Code: 004759
College Name: York College ";

reference.child("file1.txt").putBytes(data1.getBytes()).addOnSuccessListener(new addOnSuccessListener<UploadTask.TaskSnapshot taskSnapshot>);
    @Override
    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot){
        Toast.makeText( context: MainActivity.this, text: "File1 Uploaded Successfully", Toast.LENGTH_SHORT).show();
    }).addOnFailureListener(new addOnFailureListener(){
      @Override
      public void onFailure(@Nonnull Exception e){
        Toast.makeText( context: MainActivity.this, e.toString(), Toast.LENGTH_SHORT.show();
      }
    });
