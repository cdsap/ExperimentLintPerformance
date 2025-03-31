package com.performance.module_4_184

class Feature184UseCase2(
    private val repository: Feature184Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
