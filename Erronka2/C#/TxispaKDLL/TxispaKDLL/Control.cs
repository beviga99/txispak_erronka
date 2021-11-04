using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TxispaKDLL
{
    public partial class Control : UserControl
    {
        public Control()
        {
            InitializeComponent();
            this.bezeroakTableAdapter.Fill(this.txispakDataSet.Bezeroak);
            this.produktuakTableAdapter.Fill(this.txispakDataSet.Produktuak);
            this.salmentakTableAdapter.Fill(this.txispakDataSet.Salmentak);
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }
    }
}
