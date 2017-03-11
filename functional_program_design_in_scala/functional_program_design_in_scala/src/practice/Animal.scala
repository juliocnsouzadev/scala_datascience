package practice

class Animal(var kingdom: String,
             var phylum: String,
             var clazz: String,
             var order: String,
             var family: String,
             var gender: String,
             var spicies: String,
             var name: String) extends Similarity {

  def isSimiliar(other: Any): Boolean = {
    other.isInstanceOf[Animal] &&
      other.asInstanceOf[Animal].kingdom == this.kingdom &&
      other.asInstanceOf[Animal].phylum == this.phylum &&
      other.asInstanceOf[Animal].clazz == this.clazz &&
      other.asInstanceOf[Animal].order == this.order &&
      other.asInstanceOf[Animal].family == this.family &&
      other.asInstanceOf[Animal].gender == this.gender &&
      other.asInstanceOf[Animal].spicies == this.spicies
  }
  
  override def toString(): String = this.name;
}