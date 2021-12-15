using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.EntityFrameworkCore;
using ProjetoPUC.Models;

namespace ProjetoPUC.Pages.Produtos
{
    public class IndexModel : PageModel
    {
        private readonly ProjetoPUC.Models.PucDBContext _context;

        public IndexModel(ProjetoPUC.Models.PucDBContext context)
        {
            _context = context;
        }

        public IList<Produto> Produto { get;set; }

        public async Task OnGetAsync()
        {
            Produto = await _context.Produtos.ToListAsync();
        }
    }
}
