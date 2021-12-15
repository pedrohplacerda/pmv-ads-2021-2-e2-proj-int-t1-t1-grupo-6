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
    public class DeleteModel : PageModel
    {
        private readonly ProjetoPUC.Models.PucDBContext _context;

        public DeleteModel(ProjetoPUC.Models.PucDBContext context)
        {
            _context = context;
        }

        [BindProperty]
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

        public async Task<IActionResult> OnPostAsync(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            Estoque = await _context.Estoque.FindAsync(id);

            if (Estoque != null)
            {
                _context.Estoque.Remove(Estoque);
                await _context.SaveChangesAsync();
            }

            return RedirectToPage("./Index");
        }
    }
}
