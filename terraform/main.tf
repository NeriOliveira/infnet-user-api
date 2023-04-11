provider "aws" {
  region  = "us-east-1"
  profile = "Terraform"
}

module "ec2_instance" {
  source  = "terraform-aws-modules/ec2-instance/aws"
  version = "~> 3.0"

  name = "infnet-pno"

  ami                    = "ami-0a695f0d95cefc163"
  instance_type          = "t2.micro"
  key_name               = "terraform-infnet"
  monitoring             = true
  vpc_security_group_ids = ["sg-08286fc6bfd6535ca"]
  subnet_id              = "subnet-0428c53db2ba68420"

  tags = {
    Terraform   = "true"
    Environment = "dev"
    Autor       = "Patrick Neri de Oliveira"
  }
}