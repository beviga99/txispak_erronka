
namespace PROForm
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.txispakDataSet = new PROForm.txispakDataSet();
            this.produktuakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.produktuakTableAdapter = new PROForm.txispakDataSetTableAdapters.ProduktuakTableAdapter();
            this.userControl12 = new PRODLL.UserControl1();
            this.produktuakTableAdapter1 = new PRODLL.txpDataSetTableAdapters.ProduktuakTableAdapter();
            this.userControl21 = new PRODLL.UserControl2();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.produktuakBindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // txispakDataSet
            // 
            this.txispakDataSet.DataSetName = "txispakDataSet";
            this.txispakDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // produktuakBindingSource
            // 
            this.produktuakBindingSource.DataMember = "Produktuak";
            this.produktuakBindingSource.DataSource = this.txispakDataSet;
            // 
            // produktuakTableAdapter
            // 
            this.produktuakTableAdapter.ClearBeforeFill = true;
            // 
            // userControl12
            // 
            this.userControl12.Location = new System.Drawing.Point(23, 41);
            this.userControl12.Name = "userControl12";
            this.userControl12.Size = new System.Drawing.Size(275, 213);
            this.userControl12.TabIndex = 1;
            // 
            // produktuakTableAdapter1
            // 
            this.produktuakTableAdapter1.ClearBeforeFill = true;
            // 
            // userControl21
            // 
            this.userControl21.Location = new System.Drawing.Point(379, 74);
            this.userControl21.Name = "userControl21";
            this.userControl21.Size = new System.Drawing.Size(351, 213);
            this.userControl21.TabIndex = 2;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.userControl21);
            this.Controls.Add(this.userControl12);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.produktuakBindingSource)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion
        private txispakDataSet txispakDataSet;
        private System.Windows.Forms.BindingSource produktuakBindingSource;
        private txispakDataSetTableAdapters.ProduktuakTableAdapter produktuakTableAdapter;
        private PRODLL.txpDataSetTableAdapters.ProduktuakTableAdapter produktuakTableAdapter1;
        private PRODLL.UserControl1 userControl12;
        private PRODLL.UserControl2 userControl21;
    }
}

