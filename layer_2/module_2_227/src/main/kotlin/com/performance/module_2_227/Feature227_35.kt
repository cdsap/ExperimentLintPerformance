package com.performance.module_2_227

class Feature227UseCase1(
    private val repository: Feature227Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
