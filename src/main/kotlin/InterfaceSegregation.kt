package org.example

interface IHPPrinter {
    fun print(document: String)
    fun scan(document: String)
    fun fax(document: String)
}

class HPSmartTank : IHPPrinter {
    override fun print(document: String) = println("Printing document: $document")
    override fun scan(document: String)  = println("Scanning document: $document")
    override fun fax(document: String)   = println("Faxing document: $document")
}

class HPDeskJet  : IHPPrinter {
    override fun print(document: String) = println("Printing document: $document")
    override fun scan(document: String)  = throw UnsupportedOperationException("Scan not supported")
    override fun fax(document: String)   = throw UnsupportedOperationException("Scan not supported")
}

class HPLaserJet  : IHPPrinter {
    override fun print(document: String) = println("Printing document: $document")
    override fun scan(document: String)  = println("Scanning document: $document")
    override fun fax(document: String)   = throw UnsupportedOperationException("Scan not supported")
}

/*
interface IHPPrinter { fun print(document: String) }
interface IHPPrinterAndScanner : IHPPrinter { fun scan(document: String) }
interface IHPPrinterScannerAndFax : IHPPrinterAndScanner { fun fax(document: String) }

class HPSmartTank : IHPPrinterScannerAndFax {
    override fun print(document: String) = println("Printing document: $document")
    override fun scan(document: String)  = println("Scanning document: $document")
    override fun fax(document: String)   = println("Faxing document: $document")
}

class HPDeskJet : IHPPrinter {
    override fun print(document: String) = println("Printing document: $document")
}

class HPLaserJet : IHPPrinterAndScanner {
    override fun print(document: String) = println("Printing document: $document")
    override fun scan(document: String)  = println("Scanning document: $document")
}*/
