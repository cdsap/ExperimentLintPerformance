package com.performance.module_2_227

class Feature227UseCase2(
    private val repository: Feature227Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
