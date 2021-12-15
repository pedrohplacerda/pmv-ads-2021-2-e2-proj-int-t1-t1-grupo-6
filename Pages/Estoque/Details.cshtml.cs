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
    public class DetailsModel : PageModel
    {
        private readonly ProjetoPUC.Models.PucDBContext _context;

        public DetailsModel(ProjetoPUC.Models.PucDBContext context)
        {
            _context = context;
        }

        public ProjetoPUC.Models.Estoque Estoque { get; set; }

        public async Task<IActionResult> OnGetAsync(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            Estoque = await _context.Estoque
                .Include(e => e.Empresa).FirstOrDefaultAsync(m => m.Id == id);

            if (Estoque == null)
            {
                return NotFound();
            }
            return Page();
        }
    }
}
