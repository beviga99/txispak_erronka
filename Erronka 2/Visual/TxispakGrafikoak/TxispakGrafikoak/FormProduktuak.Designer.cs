
namespace TxispakGrafikoak
{
    partial class FormProduktuak
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.gp_2 = new System.Windows.Forms.GroupBox();
            this.label2 = new System.Windows.Forms.Label();
            this.pictureBox2 = new System.Windows.Forms.PictureBox();
            this.button2 = new System.Windows.Forms.Button();
            this.kontrola1 = new ProduktuaDLL.Kontrola();
            this.kontrola2 = new ProduktuTaulaDLL.Kontrola();
            this.button1 = new System.Windows.Forms.Button();
            this.kontrola3 = new ProduktuPopuDLL.Kontrola();
            this.produktuakTableAdapter = new TxispakGrafikoak.TxispakDataSetTableAdapters.ProduktuakTableAdapter();
            this.produktuakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.txispakDataSet = new TxispakGrafikoak.TxispakDataSet();
            this.gp_2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.produktuakBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet)).BeginInit();
            this.SuspendLayout();
            // 
            // gp_2
            // 
            this.gp_2.Controls.Add(this.label2);
            this.gp_2.Controls.Add(this.pictureBox2);
            this.gp_2.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.gp_2.ForeColor = System.Drawing.Color.White;
            this.gp_2.Location = new System.Drawing.Point(34, 29);
            this.gp_2.Name = "gp_2";
            this.gp_2.Size = new System.Drawing.Size(200, 100);
            this.gp_2.TabIndex = 6;
            this.gp_2.TabStop = false;
            this.gp_2.Text = "PRODUKTUAK GUZTIRA";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(108, 50);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(0, 16);
            this.label2.TabIndex = 1;
            // 
            // pictureBox2
            // 
            this.pictureBox2.Image = global::TxispakGrafikoak.Properties.Resources._81960;
            this.pictureBox2.Location = new System.Drawing.Point(24, 34);
            this.pictureBox2.Name = "pictureBox2";
            this.pictureBox2.Size = new System.Drawing.Size(60, 45);
            this.pictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox2.TabIndex = 0;
            this.pictureBox2.TabStop = false;
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(34, 511);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(75, 23);
            this.button2.TabIndex = 10;
            this.button2.Text = "BACK";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // kontrola1
            // 
            this.kontrola1.Location = new System.Drawing.Point(536, 29);
            this.kontrola1.Name = "kontrola1";
            this.kontrola1.Size = new System.Drawing.Size(400, 239);
            this.kontrola1.TabIndex = 11;
            // 
            // kontrola2
            // 
            this.kontrola2.Location = new System.Drawing.Point(34, 191);
            this.kontrola2.Name = "kontrola2";
            this.kontrola2.Size = new System.Drawing.Size(363, 245);
            this.kontrola2.TabIndex = 12;
            // 
            // button1
            // 
            this.button1.Image = global::TxispakGrafikoak.Properties.Resources.close;
            this.button1.Location = new System.Drawing.Point(996, 12);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(32, 32);
            this.button1.TabIndex = 13;
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // kontrola3
            // 
            this.kontrola3.Location = new System.Drawing.Point(536, 304);
            this.kontrola3.Name = "kontrola3";
            this.kontrola3.Size = new System.Drawing.Size(386, 251);
            this.kontrola3.TabIndex = 14;
            // 
            // produktuakTableAdapter
            // 
            this.produktuakTableAdapter.ClearBeforeFill = true;
            // 
            // produktuakBindingSource
            // 
            this.produktuakBindingSource.DataMember = "Produktuak";
            // 
            // txispakDataSet
            // 
            this.txispakDataSet.DataSetName = "TxispakDataSet";
            this.txispakDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // FormProduktuak
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ControlDarkDark;
            this.ClientSize = new System.Drawing.Size(1040, 546);
            this.Controls.Add(this.kontrola3);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.kontrola2);
            this.Controls.Add(this.kontrola1);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.gp_2);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "FormProduktuak";
            this.Text = "FormProduktuak";
            this.Load += new System.EventHandler(this.FormProduktuak_Load);
            this.gp_2.ResumeLayout(false);
            this.gp_2.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.produktuakBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox gp_2;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.PictureBox pictureBox2;
        private System.Windows.Forms.Button button2;
        private ProduktuaDLL.Kontrola kontrola1;
        private ProduktuTaulaDLL.Kontrola kontrola2;
        private System.Windows.Forms.Button button1;
        private ProduktuPopuDLL.Kontrola kontrola3;
        private TxispakDataSetTableAdapters.ProduktuakTableAdapter produktuakTableAdapter;
        private System.Windows.Forms.BindingSource produktuakBindingSource;
        private TxispakDataSet txispakDataSet;
    }
}