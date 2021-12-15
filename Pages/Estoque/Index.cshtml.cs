using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.EntityFrameworkCore;
using ProjetoPUC.Models;

namespace ProjetoPUC.Pages.Estoque
{
    public class IndexModel : PageModel
    {
        private readonly ProjetoPUC.Models.PucDBContext _context;

        public IndexModel(ProjetoPUC.Models.PucDBContext context)
        {
            _context = context;
        }

        public IList<ProjetoPUC.Models.Estoque> Estoque { get;set; }

        public async Task OnGetAsync()
        {
            Estoque = await _context.Estoque
                .Include(e => e.Empresa).ToListAsync();
        }
    }
}
