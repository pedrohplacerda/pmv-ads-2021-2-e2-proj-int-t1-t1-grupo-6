using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using ProjetoPUC.Models;

namespace ProjetoPUC.Models
{
    public class Produto
    {
        public int Id { get; set; }
        public string Nome { get; set; }
        public int? Quantidade { get; set; }
        public string Preco { get; set; }
    }
}
