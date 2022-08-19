# Patika.dev
Patika.dev Profil : https://app.patika.dev/cans06

# Odev - Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan program
Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

# Programın Çalışması:
- Kullanıcıdan bir değer girmesi istenir.

## addItem() Metotu:
Diziye 0-99 arası integer değerler ile doldurur.

## maxMinValue
Dizinin en büyük ve en küçük elemanını bulur ve değer olarak en büyük elemanı döndürür.

## dist() Metotu:
temp & tempMin = Kullanıcıdan alınan değer ile dizinin en büyük elemanının mutlak değerini verir.
- foreach döngüsü ile dizinin değerleri,Kullanıcıdan alınan değerler ile karşılaştırılır.(i dizinin elemanı,value kullanıcının girdiği değer)
- i değeri ,value değerinden büyükse ;
- -   i-value değerinin mutlak değeri temp değeri ile karşılaştırılır. değer küçükse i değeri max değişkenine atanır.
- - i değeri ,value değerinden küçükse ;
- -   i-value değerinin mutlak değeri temp değeri ile karşılaştırılır. değer küçükse i değeri min değişkenine atanır.